import { StyleSheet } from "react-native";

const COLORS = {
    gray: 'rgba(0, 0, 0, 0.36)',
}

const styles = StyleSheet.create({
    overview: {
        justifyContent: 'center',
        alignItems: 'center',
    },
    imagem: {
        width: 72,
        height: 72,
        borderRadius: 100,
        backgroundColor: COLORS.gray
    },
    descricao: {
        color: COLORS.gray
    }
})

export default styles