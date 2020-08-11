import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NgbDatePickerRangeComponent } from './ngb-date-picker-range.component';

describe('NgbDatePickerRangeComponent', () => {
  let component: NgbDatePickerRangeComponent;
  let fixture: ComponentFixture<NgbDatePickerRangeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NgbDatePickerRangeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgbDatePickerRangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
