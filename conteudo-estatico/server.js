const http = require('http');
const fs = require('fs');



http.createServer((req, res) => {

    fs.readFile('./index.html', null, (err, data) => {

        res.end(data);

    });

}).listen(8081, ()=>{
    console.log('Rodando na porta ' + 8081);
});