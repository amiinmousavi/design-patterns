using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace YieldReturn
{
    // De verzameling van de fibonaccigetallen.
    // De fibonaccigetallen zijn 1, 1, 2, 3, ...
    // Elk getal vanaf het derde is de som van zijn twee voorgangers.
    class Fibonacci
    {
        // Een generatormethode die in principe nooit stopt.
        // (maar dus op een bepaald moment overflow zal veroorzaken)
        public IEnumerator<int> Getallen()
        {
            // startwaarden voor de reeks
            int term1 = 1;
            int term2 = 0;
            int volgende;

            while (true)
            {
                volgende = term1 + term2;
                term1 = term2;
                term2 = volgende;

                yield return volgende;
            }
        }

        // Een generatormethode die stopt nadat er eeen aantal
        // getallen gegenereerd zijn.
        public IEnumerable<int> Getallen(int aantal)
        {
            // startwaarden voor de reeks
            int term1 = 1;
            int term2 = 0;
            int volgende;

            while (aantal-- > 0)
            {
                volgende = term1 + term2;
                term1 = term2;
                term2 = volgende;

                yield return volgende;
            }
        }
    }
}
