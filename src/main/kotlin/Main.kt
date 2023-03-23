import Matematicas.Basicas
import javax.swing.JOptionPane

fun main(args: Array<String>) {
    var mat = Basicas(11,111)

    JOptionPane.showMessageDialog(null, "Suma = ${mat.suma()}")
    JOptionPane.showMessageDialog(null, "Resta = ${mat.resta()}")
    JOptionPane.showMessageDialog(null, "Multiplicacion = ${mat.multi()}")
    JOptionPane.showMessageDialog(null, "Division = ${mat.division()}")
}