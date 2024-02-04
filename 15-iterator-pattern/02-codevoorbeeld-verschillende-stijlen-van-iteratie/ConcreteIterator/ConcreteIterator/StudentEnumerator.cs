using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConcreteIterator
{
    // Hoe zou een iterator er van binnen kunnen uitzien?
    class StudentEnumerator : IEnumerator<Student>
    {
        // Referentie naar de collectie waarover ge-itereerd wordt.
        private List<Student> lijst;
        // De positie van de iteratie.
        private int currentIdx;

        // Constructor.
        // Initialiseren van de referentie naar de collectie.
        // De interface IEnumerator<> schrijft voor dat de iterator bij creatie
        // nog niet naar het eerste element mag wijzen, maar moet wijzen naar
        // de positie juist voor het eerste element. Daarom wordt currentIdx 
        // ingesteld op -1.
        public StudentEnumerator(List<Student> lijst)
        {
            this.lijst = lijst;
            currentIdx = -1;
        }

        // Het huidige element retourneren.
        public Student Current
        {
            get
            {
                return lijst[currentIdx];
            }
        }

        // Hier moeten eventuele gebruikte resources weer vrijgegeven worden.
        // Deze implementatie gebruikt geen resources, dus blijft dit leeg.
        public void Dispose()
        {
            
        }

        // Het huidige element retourneren, maar als Object, niet als Student.
        object System.Collections.IEnumerator.Current
        {
            get { return Current; }
        }

        // De iterator 1 positie opschuiven.
        // Als de nieuwe positie nog in de collectie zit, dan is de returnwaarde true.
        // Als de nieuwe positie niet meer in de collectie zit (voorbij het laatste element), dan 
        // is de returnwaarde false.
        public bool MoveNext()
        {
            currentIdx++;
            if (currentIdx >= 0 && currentIdx < lijst.Count)
                return true;
            else
                return false;
        }

        // De iterator terug positioneren op de beginpositie (dus de positie
        //  voor het eerste element uit de collectie).
        public void Reset()
        {
            currentIdx = -1;
        }
    }
}
