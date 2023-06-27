var express = require('express')
var {engine} = require('express-handlebars')
var prova = express()
var bp = require('body-parser')
var cadastros = []


prova.use(bp.urlencoded({extended: false}))
prova.use(bp.json())
prova.engine('handlebars', engine())
prova.set('view engine', 'handlebars')
prova.set('views', './views')
prova.use(express.static('public'))


prova.get('/',function(req,res){
    res.render('index')
})

prova.post('/bemvindo',function(req, res){
    Mengonome = req.body.nome
    Mengotelefone = req.body.telefone
    Mengoemail = req.body.email
    Mengoendereco = req.body.endereco

    usuario = {"nome":Mengonome, "telefone":Mengotelefone, "email":Mengoemail, "endereco":Mengoendereco
    }
    cadastros.push(usuario)

    res.render('bemvindo', {cadastros})
})

prova.listen(8090,function(){
    console.log('http://localhost:8090')
})