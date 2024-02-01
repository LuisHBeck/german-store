import { View, Text, Image } from 'react-native'
import React from 'react'
import { AntDesign } from "@expo/vector-icons"
import styles from '../Products/style'

export default function Products(props) {
  return (
    <View style={styles.produto}>
      <Image
        source={require('../../assets/produto.png')}
        style={styles.imagem}
        resizeMode='contain'
      />
      <View style={styles.rodape}>
        <Text style={styles.nome}>{props.nome}</Text>
        <View style={styles.layout}>
            <Text style={styles.valor}>{props.valor}</Text>
            <View style={styles.carrinho}>
                {/* <AntDesign 
                    name='cart'
                    size={30}
                    color={'#fff'}
                    style={styles.icon}
                /> */}
            </View>
        </View>
      </View>
    </View>
  )
}       