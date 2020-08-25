import { Component, OnInit, Input } from '@angular/core';
import { InputText } from "../../../models/form/input-text";
import { InputLabelTypeEnum } from 'src/app/models/enums/input_label_type';

@Component({
  selector: 'app-input-text',
  templateUrl: './input-text.component.html',
  styleUrls: ['./input-text.component.less']
})
export class InputTextComponent implements OnInit {

  @Input("options") options:InputText;

  inputLabelTypeEnum = InputLabelTypeEnum;

  constructor() { }

  ngOnInit(): void {
  }

}
