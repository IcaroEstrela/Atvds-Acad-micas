var express = require('express')
var {engine} = require('express-handlebars')
var tega = express()

tega.engine('handlebars', engine())
tega.set('view engine','handlebars')
tega.set('views', './views')
tega.use(express.static('public'))


tega.get('/',function(req,res){
    res.render('inicio')
})


tega.listen(8090,function(){
    console.log('http://localhost:8090')
})