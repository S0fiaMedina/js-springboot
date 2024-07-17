export class userComponent extends HTMLElement{
    constructor(){
        super();
        this.attachShadow({mode : "open"});
        this.shadowRoot.innerHTML = `
                    <style>
                        .card {
                            border: 1px solid #ccc;
                            padding: 16px;
                            border-radius: 8px;
                            margin: 8px;
                            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
                        }
                    </style>
                    <div class="card">
                        <h2 id="nombre"></h2>
                        <p id="email"></p>
                        <p id="creacion"></p>
                    </div>
                `;
    }

    connectedCallback() {
        const nombre = this.getAttribute('nombre');
        const email = this.getAttribute('email');
        const creacion = this.getAttribute('creacion');
        console.log(nombre, email, creacion)

        this.shadowRoot.getElementById('nombre').textContent = `Nombre: ${nombre}`;
        this.shadowRoot.getElementById('email').textContent = `Email: ${email}`;
        this.shadowRoot.getElementById('creacion').textContent = `fecha de nacimiento: ${creacion}`;
    }

}

customElements.define('user-component', userComponent)