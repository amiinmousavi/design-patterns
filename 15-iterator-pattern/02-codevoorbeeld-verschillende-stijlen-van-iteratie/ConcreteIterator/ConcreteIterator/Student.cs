using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConcreteIterator
{
    class Student
    {
        public string Naam { get; set; }
        public string StudentenNummer { get; set; }

        public Student(string Naam, string StudentenNummer)
        {
            this.Naam = Naam;
            this.StudentenNummer = StudentenNummer;
        }

        public Student() : this(string.Empty, string.Empty)
        {

        }

        public override string ToString()
        {
            return string.Format("Student {0} met nummer {1}", this.Naam, this.StudentenNummer);
        }
    }
}
