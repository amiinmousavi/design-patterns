using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YieldReturn
{
    class Program
    {
        // Een voorbeeld van een collectie die werkt met yield-return.
        // De collectie zit in de klasse Fibonacci.
        static void Main(string[] args)
        {
            Fibonacci fi = new Fibonacci();

            // De reeks van fibonacci met een generatormethode zonder argumenten (Getallen()).
            // De generator wordt hier aangestuurd met een IEnumerator.
            // De MoveNext() van de IEnumerator staat in het controledeel van de for-lus.
            // Dat is omdat MoveNext() in principe ook false kan retourneren, en in zo een
            // geval moet de lus stoppen.
            IEnumerator<int> fibonaccigetallen = fi.Getallen();
            Console.WriteLine("De eerste 20 fibonaccigetallen zijn:");
            for (int i = 0; i < 20 && fibonaccigetallen.MoveNext(); ++i)
            {
                int getal = fibonaccigetallen.Current;
                Console.Write("{0}, ", getal);
            }
            Console.WriteLine();

            // Een variant hierop, waarbij het aantal getallen dat gegenereerd moet
            // worden een argument is van de generatormethode.
            Console.WriteLine("De eerste 10 fibonaccigetallen zijn:");
            foreach (int getal in fi.Getallen(10))
                Console.Write("{0}, ", getal);
            Console.WriteLine();
        }
    }
}
