import { StyleSheet } from "react-native";

const COLORS = {
    gray: "rgba(0, 0, 0, 0.19)"
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },
    imagem: {
        justifyContent: 'center',
        alignItems: 'center',
        marginTop: '106px',
    },
    inputNome: {
        marginTop: '190px',
        justifyContent: 'center',
        alignItems: 'center',
    },
    inputEndereco: {
        marginTop: '20px',
        justifyContent: 'center',
        alignItems: 'center',
    },
    inputEmail: {
        marginTop: '20px',
        justifyContent: 'center',
        alignItems: 'center'
    },
    inputSenha: {
        marginTop: '20px',
        justifyContent: 'center',
        alignItems: 'center'
    },
    botaoCriar: {
        marginTop: '40px',
        justifyContent: 'center',
        alignItems: 'center'
    },
    botaoLogin: {
        marginTop: 2,
        alignItems: 'center',
        justifyContent: 'center',
    },
    texto: {
        color: COLORS.gray,
    },
    footer: {
        marginTop: 170,
        justifyContent: 'center',
        alignItems: 'center'
    }
})

export default styles