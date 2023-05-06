const palindrome = require('./palindrome')
const prompt = require('prompt')
prompt.start()
prompt.get(["n"], (err, res) => {
    if (err) throw err
    console.log(res.n)
    palindrome.calculate(res.n)
})