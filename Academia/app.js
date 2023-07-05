var express = require('express');
var {engine} = require('express-handlebars');
var bp = require('body-parser');
var cadastros = [];
var app = express();

app.use(bp.urlencoded({ extended: false }));
app.use(bp.json());
app.engine('handlebars', engine());
app.set('view engine', 'handlebars');
app.set('views', './views');
app.use(express.static('public'));


app.get('/', function(req, res){
    res.render('index');
});
app.get('/quemsomos', function(req, res){
    res.render('quemsomos');
});
app.get('/contato', function(req, res){
    res.render('contato');
});
app.get('/cadastro', function(req, res){
    res.render('cadastro');
});
app.get('/horarios', function(req, res){
    res.render('horarios');
});

app.listen(8090, function(){
    console.log('http://localhost:8090');
})