import com.example.tiptime.calculateTip
import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
//Créez une méthode pour tester le calcul d'un pourboire de 20 % pour un montant de 10 $. Le résultat attendu de ce calcul est 2 $.
@Test
fun calculateTip_20PercentNoRoundup() {
    val amount = 10.00
    val tipPercent = 20.00
    val expectedTip = NumberFormat.getCurrencyInstance().format(2)
    val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
    assertEquals(expectedTip, actualTip)
    //La méthode assertEquals() prend deux paramètres en entrée : une valeur attendue et une valeur réelle. Si ces valeurs sont égales, l'assertion et le test sont concluants. Dans le cas contraire, l'assertion et le test échouent.

}
}