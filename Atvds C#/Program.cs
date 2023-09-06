using Atvds_C_;

Pessoa p1 = new Pessoa("Tiago", "Camaçari", 19);
Pessoa p2 = new Pessoa("Icaro", "Stella Maris", 22);
Pessoa p3 = new Pessoa("Kevin", "Piraja", 24);
Pessoa p4 = new Pessoa("Wyll", "Fazenda Grande", 20);
Pessoa p5 = new Pessoa("Bergues", "Pinto de Aguiar", 21);
Pessoa p6 = new Pessoa("Raphael", "Madre de Deus", 23);

Evento e1 = new Evento("Paredão na favela","Engomadeira");
e1.PagarEvento();
e1.listarPessoas();