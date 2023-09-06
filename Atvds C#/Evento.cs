using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Atvds_C_
{
    public class Evento
    {
        public string Nome { get; set; }
        public string Local { get; set; }
        public double Valor { get; set; }
        public List<Pessoa> Pessoas { get; set; }
        public Evento(){
            Pessoas = new List<Pessoa>();
        }
        public Evento(string nome, string local)
        {
            Pessoas = new List<Pessoa>();
            this.Nome = nome;
            this.Local = local;
        }
        public void PagarEvento(){
            string pago;
            Console.WriteLine("O Evento será pago? \nSim / Nao");
            pago = Console.ReadLine();
            if(string.Equals(pago, "Nao", StringComparison.OrdinalIgnoreCase)|| string.Equals(pago, "não", StringComparison.OrdinalIgnoreCase)){
                Valor = 0;
            }else
            if(string.Equals(pago, "sim", StringComparison.OrdinalIgnoreCase)){
                Console.WriteLine("Digite o valor do evento: ");
                Valor = double.Parse(Console.ReadLine());
            }else{
                Console.WriteLine("Resposta Inválida Animal! \n Tente Novamente Burrão.");
                PagarEvento();  
            }
        }
        public void listarPessoas(){
            Console.WriteLine("Lista de convidados:");
            foreach (var item in Pessoas)
            {
                System.Console.WriteLine(item.Nome);
            }
        }
    }
}

