import { StyleSheet } from "react-native";

const COLORS = {
    primaryGreen: "#31B64E",
    white: "#fff",
}

const styles = StyleSheet.create({
    button: {
        borderRadius: 50,
        width: 307,
        height: 42,
        backgroundColor: COLORS.primaryGreen,
        alignItems: "center",
        justifyContent: "center",
    },
    text: {
        color: COLORS.white,
        fontSize: 17,
    }
})

export default styles