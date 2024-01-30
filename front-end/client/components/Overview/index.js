import { View, Text } from 'react-native'
import React from 'react'
import styles from '../Overview/style'

export default function Overview(props) {
  return (
    <View style={styles.overview}>
      <View style={styles.imagem}>
        <Text></Text>
      </View>
      <View>
        <Text style={styles.descricao}>{props.descricao}</Text>
      </View>
    </View>
  )
}