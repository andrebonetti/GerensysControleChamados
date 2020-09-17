import { Component, OnInit, Input } from '@angular/core';
import { InputTextArea } from 'src/app/models/form/input-text-area';
import { InputLabelTypeEnum } from 'src/app/models/enums/input_label_type';

@Component({
  selector: 'app-input-text-area',
  templateUrl: './input-text-area.component.html',
  styleUrls: ['./input-text-area.component.less']
})
export class InputTextAreaComponent implements OnInit {

  @Input("options") options:InputTextArea;

  inputLabelTypeEnum = InputLabelTypeEnum;

  constructor() { }

  ngOnInit(): void {
  }

}
