import { View, Text, Image, TouchableOpacity } from 'react-native'
import React from 'react'
import styles from './style'
import Input from '../../components/Input'
import Button from '../../components/Button'

export default function SignUp() {
  return (
    <View style={styles.container}>

      <View style={styles.imagem}>
        <Image
          source={require("../../assets/logo.png")}
          style={{width: "100%"}}
          resizeMode='contain'
        />
      </View>

      <View style={styles.inputEmail}>
        <Input
          placeholder="Email"
        />
      </View>

      <View style={styles.inputSenha}>
        <Input
          placeholder="Senha"
        />
      </View>

      <View style={styles.botaoLogin}>
        <TouchableOpacity>
          <Button
            texto="Login"
          />
        </TouchableOpacity>
      </View>

      <View style={styles.botaoAbrir}>
        <TouchableOpacity>
          <Text style={styles.texto}>Abra sua Conta</Text>
        </TouchableOpacity>
      </View>

      <View style={styles.footer}>
        <Text style={styles.texto}>German Store</Text>
      </View>

    </View>
  )
}