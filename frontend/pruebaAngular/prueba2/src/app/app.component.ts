import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';

// Tenemos que importar la clase de los componentes que vamos a usar
import { Componente1Component } from './componente1/componente1.component';
import { Componente2Component } from './componente2/componente2.component';

// Componente que los envuelve a todos, decorador para el mismo
@Component({
  selector: 'app-root', // Selector raiz
  standalone: true,
  imports: [CommonModule,RouterOutlet, Componente1Component, Componente2Component],
  templateUrl: './app.component.html',//Aqui puedes tener una template de html
  styleUrl: './app.component.css'// Y de css
})
export class AppComponent {
  nombre = `Fran`;
}
