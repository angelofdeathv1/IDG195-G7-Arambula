import React from 'react';
import { StyleSheet, Text, TextInput, View, Button, Alert } from 'react-native';

export default class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      usuario: '',
      password: ''
    };
  }

  _getAlumnosFromApiAsync() {
    return fetch('http://138.68.231.116:5000/alumnos')
      .then((response) => response.json())
      .then((responseJson) => {
        return responseJson;
      })
      .then((object)=>{
        console.log(object)
        object.find(obj => {
          return obj.matricula == "t020888"
        })
      })
      .then((object)=>{
        console.log(object)
      })
      .catch((error) => {
        console.error(error);
      });
  }

  _onPressButton() {
    Alert('test')
  }

  render() {
    return (
      <View style={{ padding: 20 }}>
        <TextInput
          style={{ height: 60 }}
          placeholder="Matricula"
          onChangeText={(usuario) => this.setState({ usuario })}
        />
        <TextInput
          style={{ height: 60 }}
          placeholder="Contraseña"
          onChangeText={(password) => this.setState({ password })}
        />
        <View style={styles.buttonContainer}>
          <Button
            onPress={this._getAlumnosFromApiAsync}
            title="Ingresar"
            //color="#000"
          />
        </View>
      </View>
    );

  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  buttonContainer: {
    margin: 20,
  },
  alternativeLayoutButtonContainer: {
    margin: 20,
    flexDirection: 'row',
    justifyContent: 'space-between'
  }
});