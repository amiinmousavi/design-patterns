using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConcreteIterator
{
    class Program
    {
        static void Main(string[] args)
        {
            // De collectie om over te itereren
            List<Student> studentenlijst = new List<Student>()
            {
                new Student("Jos", "S1"),
                new Student("Jolien", "S2"),
                new Student("Kamiel", "S3"),
                new Student("Barbara", "S4"),
            };

            Console.WriteLine("Klassieke iteratie met foreach");
            // De klassieke manier om te itereren: een foreach-lus
            foreach (Student s in studentenlijst)
                Console.WriteLine(s);

            Console.WriteLine();
            Console.WriteLine("Iteratie met een Enumerator");
            // Itereren met een iterator
            // De iterator moet je vragen aan de collectie
            IEnumerator<Student> studiter = studentenlijst.GetEnumerator();
            while (studiter.MoveNext())
            {
                Student s = studiter.Current;
                Console.WriteLine(s);
            }

            Console.WriteLine();
            Console.WriteLine("Iteratie met interne iterator");
            // Itereren met een interne iterator
            studentenlijst.ForEach(s => Console.WriteLine(s));
        }
    }
}
