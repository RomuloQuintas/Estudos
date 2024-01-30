const botaoPlayPasue = document.getElementById('play-pause');
const audioCapitulo = document.getElementById('audio-capitulo');
const proxima = document.getElementById('proximo');
const anterior = document.getElementById('anterior');
const capNome = document.getElementById('capitulo');

const num_cap = 10;
let taTocando = 0;
let capituloAtual = 1;

function tocarFaixa(){
    audioCapitulo.play();
    botaoPlayPasue.classList.remove('bi-play-circle-fill')
    botaoPlayPasue.classList.add('bi-pause-circle-fill')
}

function pausarFaixa(){
    audioCapitulo.pause()
    botaoPlayPasue.classList.add('bi-play-circle-fill')
    botaoPlayPasue.classList.remove('bi-pause-circle-fill')
}

function tocarOuPausar(){
    if(taTocando === 0){
        tocarFaixa();
        taTocando = 1;
    }else{
        pausarFaixa();
        taTocando = 0;
    }
}

function trocarNomeFaixa(){
    capNome.innerText='Capítulo '+capituloAtual;
}

function proximaFaixa(){
    if (capituloAtual === num_cap){
        capituloAtual = 1;
    }else{
        capituloAtual = capituloAtual +1; 
    }
    audioCapitulo.src = './books/dom-casmurro/'+ capituloAtual+'.mp3';
    tocarFaixa();
    taTocando = 1;
    trocarNomeFaixa();
}

function voltarFaixa(){
    if (capituloAtual === 1){
        capituloAtual = num_cap;
    }else{
        capituloAtual = capituloAtual -1; 
    }
    audioCapitulo.src = './books/dom-casmurro/'+ capituloAtual+'.mp3';
    tocarFaixa();
    taTocando = 1;
    trocarNomeFaixa();
}

botaoPlayPasue.addEventListener('click', tocarOuPausar);
proxima.addEventListener('click', proximaFaixa)
anterior.addEventListener('click', voltarFaixa);

