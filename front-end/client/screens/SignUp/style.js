import { StyleSheet } from "react-native";

const COLORS = {
    gray: "rgba(0, 0, 0, 0.19)"
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },
    imagem: {
        justifyContent: "center",
        alignItems: "center",
        marginTop: "106px"
    },
    inputEmail: {
        marginTop: "190px",
        justifyContent: "center",
        alignItems: "center",
    },
    inputSenha: {
        marginTop: "20px",
        justifyContent: "center",
        alignItems: "center",
    },
    botaoLogin: {
        marginTop: "40px",
        justifyContent: "center",
        alignItems: "center"
    },
    botaoAbrir: {
        marginTop: 2,
        alignItems: 'center',
        justifyContent: 'center',
    },
    texto: {
        color: COLORS.gray,
    },
    footer: {
        marginTop: 300,
        justifyContent: 'center',
        alignItems: 'center'
    }
})

export default styles