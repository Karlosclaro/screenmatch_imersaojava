/* function tocaSomPom () {

    document.querySelector('#som_tecla_pom').play();
}

document.querySelector('.tecla_pom').onclick = tocaSomPom;

function tocaSomClap () {

    document.querySelector('#som_tecla_clap').play();
}
document.querySelector('.tecla_clap').onclick = tocaSomClap;
 */

function tocaSomPom () {
    document.querySelector('#som_tecla_pom').play();
}

const ListadeTeclas = document.querySelectorAll('.tecla');

ListadeTeclas[0].onclick = tocaSomPom;
