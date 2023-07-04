var express = require('express');
var {engine} = require('express-handlebars');
var bodyParser = require('body-parser')

var app = express();

app.engine('handlebars', engine());
app.set('view engine', 'handlebars');
app.set('views', './views');
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.get('/', (req, res) => {
    res.render('home');
});

app.use(express.static('public'));

app.listen(3000);
console.log('http://localhost:3000');