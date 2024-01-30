import { View, Text } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import HomeScreen from './screens/SignUp/index'
import ShopScreen from './screens/ShopScreen'

const Stack = createNativeStackNavigator()


export default function Navigation() {
  return (
    <NavigationContainer>
        <Stack.Navigator screenOptions={{
          headerShown: false
        }}>
            <Stack.Screen name="Home" component={HomeScreen} />
            <Stack.Screen name="Shop" component={ShopScreen} />
        </Stack.Navigator>
    </NavigationContainer>
  )
}