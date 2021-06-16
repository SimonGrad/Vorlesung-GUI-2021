import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {SearchModel} from '../SearchModel';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  public bla: SearchModel = new SearchModel();

  @Input()
  public placeholder: string;

  @Output()
  public search: EventEmitter<string> = new EventEmitter<string>();

  public doSearch(): void {
    console.log('Do search! ' + this.bla.input);

    this.search.emit(this.bla.input);
  }
}
