import { View, Text, Image } from 'react-native'
import React from 'react'
import Input from '../../components/Input'
import { AntDesign } from "@expo/vector-icons"
import styles from '../Shop/style'
import Overview from '../../components/Overview'
import Products from '../../components/Products'

export default function Shop() {
  return (
    <View style={styles.container}>
      
      {/* <View style={styles.imagem}>
        <Image
          source={require('../../assets/logopequena.png')}
          style={{width: '100%'}}
          resizeMode='contain'
        />
      </View> */}

      <View style={styles.pesquisa}>
        <Input
          placeholder="Produtos"
        />
        <View style={styles.filtro}>
          {/* <AntDesign
            name="filter"
            size={30}
            color={"#fff"}
            style={styles.icon}
          /> */}
          <Text style={styles.icone}>S</Text>
        </View>

      </View>
      <View style={styles.features}>
        <Overview
          descricao="Roupas"
        />
        <Overview
          descricao="Eletrônicos"
        />
        <Overview
          descricao="Veículos"
        />
        <Overview
          descricao="Alimentos"
        />
      </View>

      <View style={styles.produtos}>
        <View style={styles.coluna}>
          <Products 
            nome="Roupa"
            valor="R$ 100,00"
          />
          <Products 
            nome="Roupa"
            valor="R$ 100,00"
          />
        </View>

        <View style={styles.coluna}>
        <Products 
          nome="Roupa"
          valor="R$ 100,00"
        />
        <Products 
          nome="Roupa"
          valor="R$ 100,00"
        />
        </View>

      </View>

    </View>
  )
}