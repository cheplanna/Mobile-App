
import * as React from 'react';
import { Text, View, StyleSheet, Button } from 'react-native';
import Constants from 'expo-constants';

import { StatusBar } from 'expo-status-bar';
import {SafeAreaView, Image} from 'react-native';

export default function App() {
  function pressed(){
    alert('авторизован')
  }
  return (
    <View style={styles.container}>
      <Text style={styles.text}>Вход через ВКонтакте</Text>
      <Image style={styles.logo}resizeMode='contain' source={{uri:'https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/VK.com-logo.svg/2048px-VK.com-logo.svg.png'}}/>
      <Button
        
        backgroundColor='#f194ff'
        color='#8511DF'
        title="Авторизироваться"
        
        onPress={pressed}
      />
  </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex:1,
    backgroundColor: 'black',
    alignItems: 'center',
    justifyContent: 'center',
  },
  logo:{
    width: 150,
    height: 150,
  },
  text:{
    color:'blue',
    fontFamily:'Cochin',
    fontSize: 24,
    bottom: 40
  },

});
