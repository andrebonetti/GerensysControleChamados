import { Component, OnInit, Input } from '@angular/core';
import { InputPassword } from 'src/app/models/form/input-password';
import { InputLabelTypeEnum } from 'src/app/models/enums/input_label_type';

@Component({
  selector: 'app-input-password',
  templateUrl: './input-password.component.html',
  styleUrls: ['./input-password.component.less']
})
export class InputPasswordComponent implements OnInit {

  @Input("options") options:InputPassword;

  inputLabelTypeEnum = InputLabelTypeEnum;

  constructor() { }

  ngOnInit(): void {
  }

}
