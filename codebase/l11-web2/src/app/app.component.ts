import { Component } from '@angular/core';
import {SearchModel} from './SearchModel';

@Component({
  selector: 'app-root',
  template: `
    <div>
      <h3>Book list</h3>
      <app-search (click)="testEventBubbling($event)" (search)="searchForBooks($event)" [placeholder]="'Search here2'"></app-search>
    </div>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public searchForBooks(query: string): void {
    // immer dann wenn der Benutzer in der Suchkomponente auf den Button klickt!
    console.log('Parent component searchForBooks ' + query);
    //this.bookservice.search(query);
  }

  testEventBubbling($event: MouseEvent) {
    console.log($event);
  }
}
