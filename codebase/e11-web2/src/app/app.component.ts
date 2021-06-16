import { Component } from '@angular/core';
import {LocationModel} from './LocationModel';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  onLocationFormSave(location: LocationModel) {
    console.log('AppComponent.onLocationFormSave ' + JSON.stringify(location));
  }
}

