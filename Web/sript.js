//Funcion para cambiar de modo (dia o noche)
const temaOscuro = () => {
    document.querySelector("body").setAttribute("data-bs-theme", "dark");
    document.querySelector("dl-icon").setAttribute("class", "bi bi-sun-fill");
}
const temaClaro = () => {
    document.querySelector("body").setAttribute("data-bs-theme", "light");
    document.querySelector("dl-icon").setAttribute("class", "bi bi-moon-fill");
}
const cambiarTema = () => {
    document.querySelector("body").setAttribute("data-bs-theme") === "light" ?
        temaOscuro() : temaClaro();
}
/*
const toggle = document.getElementsById('toggleDark');
const body = document.querySelector('body');

toggle.addEventListener('click', function() {
    this.classList.toggle('bi-moon')
    if (this.classList.toggle('bi-brightness-high-fill')) {
        body.style.background = 'white';
        body.style.color = 'black';
        body.style.transition = '2s';
    } else {
        body.style.background = 'black';
        body.style.color = 'white';
        body.style.transition = '2s';
    }
})
*/
/*
const colorSwitch = document.querySelector('#switch input[type="checkbox"]');
function cambiaTema(ev) {
    if (ev.target.checked) {
        document.documentElement.setAttribute('tema', 'dark');
    } else {
        document.documentElement.setAttribute('tema', 'light');
    }
}
colorSwitch.addEventListener('change', cambiaTema);
*/