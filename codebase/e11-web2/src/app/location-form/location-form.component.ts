import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {LocationModel} from '../LocationModel';

@Component({
  selector: 'app-location-form',
  templateUrl: './location-form.component.html',
  styleUrls: ['./location-form.component.css']
})
export class LocationFormComponent {
  public model: LocationModel = new LocationModel();

  @Output()
  public save: EventEmitter<LocationModel> = new EventEmitter<LocationModel>();

  public types: Array<string> = ['Type1', 'Type2', 'Type3'];

  public doSave(): void {
    console.log('Save ' + JSON.stringify(this.model));
    this.save.emit(this.model);
  }
}
