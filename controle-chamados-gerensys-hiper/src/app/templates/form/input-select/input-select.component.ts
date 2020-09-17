import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { InputSelect } from 'src/app/models/form/input-select';
import { InputLabelTypeEnum } from 'src/app/models/enums/input_label_type';

@Component({
  selector: 'app-input-select',
  templateUrl: './input-select.component.html',
  styleUrls: ['./input-select.component.less']
})
export class InputSelectComponent implements OnInit {

  @Input("options") options:InputSelect;

  inputLabelTypeEnum = InputLabelTypeEnum;

  @Output("change") change: EventEmitter<Boolean>;

  constructor() {
    this.change = new EventEmitter()
  }

  ngOnInit(): void {
  }

  changeInput(event){
    this.change.emit(event);
  }

}
