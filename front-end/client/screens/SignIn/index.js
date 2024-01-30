import { View, Text, Image, TouchableOpacity } from 'react-native'
import React from 'react'
import Input from '../../components/Input'
import Button from '../../components/Button'
import styles from '../SignIn/style'

export default function SignIn() {
  return (
    <View style={styles.container}>

      <View style={styles.imagem}>
        <Image
          source={require("../../assets/logo.png")}
          style={{width: "100%"}}
          resizeMode='contain'
        />
      </View>

      <View style={styles.inputNome}>
        <Input
          placeholder="Nome"
        />
      </View>

      <View style={styles.inputEndereco}>
        <Input
          placeholder="Endereço"
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

      <View style={styles.botaoCriar}>
        <TouchableOpacity>
            <Button 
              texto="Criar Conta"
            />
        </TouchableOpacity>
      </View>

      <View style={styles.botaoLogin}>
        <TouchableOpacity>
            <Text style={styles.texto}>Fazer Login</Text>
        </TouchableOpacity>
      </View>

      <View style={styles.footer}>
        <Text style={styles.texto}>German Store</Text>
      </View>

    </View>
  )
}