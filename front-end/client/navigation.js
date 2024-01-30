import { View, Text } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import SignUp from './screens/SignUp/index'
import Shop from './screens/Shop'
import SignIn from './screens/SignIn'

const Stack = createNativeStackNavigator()


export default function Navigation() {
  return (
    <NavigationContainer>
        <Stack.Navigator screenOptions={{
          headerShown: false
        }}>
            <Stack.Screen name="Shop" component={Shop} />
            <Stack.Screen name="SignIn" component={SignIn} />
            <Stack.Screen name="SignUp" component={SignUp} />
        </Stack.Navigator>
    </NavigationContainer>
  )
}