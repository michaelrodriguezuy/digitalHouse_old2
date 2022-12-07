const { generateText } = require('../util.js');

test('Salida de Nombre y Edad', () =>{
    const text = generateText('Daniel', 30);
    expect(text).toBe('Daniel (30 years old)');
});