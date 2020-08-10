import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FilaGridComponent } from './fila-grid.component';

describe('FilaGridComponent', () => {
  let component: FilaGridComponent;
  let fixture: ComponentFixture<FilaGridComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FilaGridComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FilaGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
