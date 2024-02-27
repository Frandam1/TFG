import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Test1Component } from './test1/test1.component';
import { Test2Component } from './test2/test2.component';
import { IndiceComponent } from './indice/indice.component';

const routes: Routes = [
  
  { path: 'componente1', component: Test1Component },
  { path: 'componente2', component: Test2Component },
  //{ path: '**', component: IndiceComponent, pathMatch: 'full' }, // Redirige a componente1 si la ruta no coincide con ninguna definida arriba
];


@NgModule({
  declarations: [
    AppComponent,
    Test1Component,
    Test2Component,
    IndiceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
