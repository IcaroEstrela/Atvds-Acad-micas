using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Atvds_C_
{
    public class Pessoa
    {
        public string Nome { get; set; }
        public string Endereco { get; set; }
        public int Idade { get; set; }

        public Pessoa(string nome, string endereco, int idade)
        {
            this.Nome = nome;
            this.Endereco = endereco;
            this.Idade = idade;
        }
    }
}