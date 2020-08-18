import { Component, OnInit, Input } from '@angular/core';
import { InputSelect } from 'src/app/models/form/input-select';

@Component({
  selector: 'app-input-select',
  templateUrl: './input-select.component.html',
  styleUrls: ['./input-select.component.less']
})
export class InputSelectComponent implements OnInit {

  @Input("options") options:InputSelect;

  constructor() { }

  ngOnInit(): void {
  }

}
