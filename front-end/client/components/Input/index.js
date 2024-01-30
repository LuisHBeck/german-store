import { View, Text, TextInput } from 'react-native'
import React from 'react'
import styles from './style'

export default function Input(props) {
  return (
    <View style={styles.inputForm}>
      <TextInput
        placeholder={props.placeholder}
        style={styles.input}
      />
    </View>
  )
}