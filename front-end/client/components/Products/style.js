import { StyleSheet } from "react-native";

const COLORS = {
    gray: 'rgba(0, 0, 0, 0.36)',
    white: '#fff',
    green: '#31B64E',
}

const styles = StyleSheet.create({
    produto: {
        width: 168,
        height: 220,
    },
    imagem: {
        width: 168,
        height: 160,
    },
    rodape: {
        width: 168,
        height: 60,
        backgroundColor: COLORS.gray,
        padding: 10,
    },
    nome: {
        color: COLORS.white,
        marginTop: 2
    },
    valor: {
        color: COLORS.white,
    },
    carrinho: {
        backgroundColor: COLORS.green,
        width: 33,
        height: 33,
        borderRadius: 100,
    },
    layout: {
        flexDirection: 'row',
        justifyContent: 'space-between',
    }
})

export default styles