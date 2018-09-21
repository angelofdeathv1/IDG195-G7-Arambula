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
  _onPressButton() {
    Alert.alert('Hola alumno universal!')
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
            onPress={this._onPressButton}
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