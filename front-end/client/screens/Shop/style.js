import { StyleSheet } from "react-native";

const COLORS = {
    gray: 'rgba(0, 0, 0, 0.19)',
    red: '#DF0404',
    green: 'rgba(0, 0, 0, 0.27)',
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },
    imagem: {
        justifyContent: 'center',
        alignItems: 'center',
        marginTop: 5,
    },
    pesquisa: {
        marginTop: 20,
        display: 'flex',
        padding: 20,
        flexDirection: 'row',
        justifyContent: 'space-between'
    },
    filtro: {
        width: 43,
        height: 43,
        borderRadius: 100,
        backgroundColor: COLORS.red,
    },
    icone: {
        color: '#fff',
        justifyContent: 'center',
        alignItems: 'center'
    },
    features:{
        marginTop: 20,
        display: 'flex',
        padding: 20,
        flexDirection: 'row',
        justifyContent: 'space-between'
    },
    produtos: {
        padding: 20,
        flexDirection: 'row',
        justifyContent: 'space-between',
    },
    coluna: {
        flexDirection: 'column',
    }
})

export default styles