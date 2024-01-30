import { StyleSheet } from "react-native";

const COLORS = {
    primaryColor: "rgba(0, 0, 0, 0.27)",
}

const styles = StyleSheet.create({
    inputForm:{
        borderRadius: 50
    },
    input: {
        width: 307,
        height: 42,
        borderWidth: 2,
        borderRadius: 40,
        borderColor: COLORS.primaryColor,
        padding: 10,
        opacity: 0.4
    }

})

export default styles