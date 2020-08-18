import { Component, OnInit, Input } from '@angular/core';
import { InputText } from "../../../models/form/input-text";

@Component({
  selector: 'app-input-text',
  templateUrl: './input-text.component.html',
  styleUrls: ['./input-text.component.less']
})
export class InputTextComponent implements OnInit {

  @Input("options") options:InputText;

  constructor() { }

  ngOnInit(): void {
  }

}
