import { View, Text } from 'react-native'
import React from 'react'
import styles from '../Button/style'

export default function Button(props) {
  return (
    <View style={styles.button}>
        <Text style={styles.text}>{props.texto}</Text>
    </View>
  )
}